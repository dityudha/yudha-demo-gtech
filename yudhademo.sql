PGDMP     8                    y         	   yudhademo    13.2    13.2     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    17177 	   yudhademo    DATABASE     i   CREATE DATABASE yudhademo WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_Indonesia.1252';
    DROP DATABASE yudhademo;
                postgres    false            ?            1259    17191    member    TABLE       CREATE TABLE public.member (
    member_id integer NOT NULL,
    first_name character varying(100),
    last_name character varying(100),
    gender character varying(10),
    email character varying(100),
    dob character varying(10),
    mobile_phone character varying(15)
);
    DROP TABLE public.member;
       public         heap    postgres    false            ?            1259    17189    member_member_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.member_member_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.member_member_id_seq;
       public          postgres    false    201            ?           0    0    member_member_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.member_member_id_seq OWNED BY public.member.member_id;
          public          postgres    false    200            "           2604    17194    member member_id    DEFAULT     t   ALTER TABLE ONLY public.member ALTER COLUMN member_id SET DEFAULT nextval('public.member_member_id_seq'::regclass);
 ?   ALTER TABLE public.member ALTER COLUMN member_id DROP DEFAULT;
       public          postgres    false    200    201    201            ?          0    17191    member 
   TABLE DATA           d   COPY public.member (member_id, first_name, last_name, gender, email, dob, mobile_phone) FROM stdin;
    public          postgres    false    201   f       ?           0    0    member_member_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.member_member_id_seq', 5, true);
          public          postgres    false    200            $           2606    17199    member member_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.member
    ADD CONSTRAINT member_pkey PRIMARY KEY (member_id);
 <   ALTER TABLE ONLY public.member DROP CONSTRAINT member_pkey;
       public            postgres    false    201            ?   A   x?3??M?M,??*?H2sR!|????????\NC#}}CKKSNS3sK#S3c?=... K?7     