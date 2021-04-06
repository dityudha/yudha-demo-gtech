package com.project.yudhademo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.yudhademo.entity.MemberEntity;
import com.project.yudhademo.repository.MemberRepository;

@RestController
@RequestMapping("/api/member")

public class MemberController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping("/get-all-member")
	public List<MemberEntity> getAllMember(){
		List<MemberEntity> allMemberlist = memberRepository.findAll();
		return allMemberlist;
		
	}
	
	@GetMapping("/get-member/{id}")
	public MemberEntity getMemberbyId(@PathVariable(value = "id") Integer memberId)
      
	{
		MemberEntity memberEntity = memberRepository.findById(memberId).get();
		
		return memberEntity;	
	}
	
    @PostMapping("/create-member")
    public MemberEntity createMember (@RequestBody MemberEntity member) {
       
    	MemberEntity savedMember = memberRepository.save(member);
    	 
    	 return savedMember;
    }
    
    @PutMapping("/update-member/{id}")
    public ResponseEntity<MemberEntity> updateMember(@PathVariable(value = "id") Integer memberId,
         @RequestBody MemberEntity memberDetails) {
    	MemberEntity member = memberRepository.findById(memberId).get();

        member.setEmail(memberDetails.getEmail());
        member.setFirstName(memberDetails.getFirstName());
        member.setLastName(memberDetails.getLastName());
        member.setGender(memberDetails.getGender());
        member.setMobile_phone(memberDetails.getMobile_phone());
        member.setDob(memberDetails.getDob());
        final MemberEntity updatedMember = memberRepository.save(member);
        return ResponseEntity.ok(updatedMember);
    }
    
    @DeleteMapping("/delete-member/{id}")
    public Map<String, Boolean> deleteMember(@PathVariable(value = "id") Integer memberId)
    {
    	MemberEntity member = memberRepository.findById(memberId).get();

    	memberRepository.delete(member);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
