PGDMP         9        
        y            hw    13.0    13.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16400    hw    DATABASE     _   CREATE DATABASE hw WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE hw;
                postgres    false            �            1259    16409    films    TABLE     x   CREATE TABLE public.films (
    uuid uuid NOT NULL,
    name character varying NOT NULL,
    length integer NOT NULL
);
    DROP TABLE public.films;
       public         heap    postgres    false            �            1259    16417    sessions    TABLE     �   CREATE TABLE public.sessions (
    uuid uuid NOT NULL,
    uuid_films uuid NOT NULL,
    price integer NOT NULL,
    session_start timestamp(0) without time zone NOT NULL
);
    DROP TABLE public.sessions;
       public         heap    postgres    false            �          0    16409    films 
   TABLE DATA           3   COPY public.films (uuid, name, length) FROM stdin;
    public          postgres    false    201            �          0    16417    sessions 
   TABLE DATA           J   COPY public.sessions (uuid, uuid_films, price, session_start) FROM stdin;
    public          postgres    false    202            (           2606    16416    films films_pk 
   CONSTRAINT     N   ALTER TABLE ONLY public.films
    ADD CONSTRAINT films_pk PRIMARY KEY (uuid);
 8   ALTER TABLE ONLY public.films DROP CONSTRAINT films_pk;
       public            postgres    false    201            *           2606    16421    sessions sessions_pk 
   CONSTRAINT     T   ALTER TABLE ONLY public.sessions
    ADD CONSTRAINT sessions_pk PRIMARY KEY (uuid);
 >   ALTER TABLE ONLY public.sessions DROP CONSTRAINT sessions_pk;
       public            postgres    false    202            +           2606    16422    sessions sessions_fk    FK CONSTRAINT     x   ALTER TABLE ONLY public.sessions
    ADD CONSTRAINT sessions_fk FOREIGN KEY (uuid_films) REFERENCES public.films(uuid);
 >   ALTER TABLE ONLY public.sessions DROP CONSTRAINT sessions_fk;
       public          postgres    false    2856    202    201            �   �   x�U�Mq�0@�s���c�9��X���0DgZ)�fo)�o�3�$��D�(��(���������<>p�m�BIWmH ��E�H�N�powD���s,?�k5��B�p�bp����t���i��d�	��ꪃt����_�U��'H	�����#ǰ�/���c��?�Y�      �   Z   x�ʱ� ��p��	�k��;�hY�i4�v��gˊb�IΜ-��3\v�)���X+��S�I��BA�"n�#�9����          �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16400    hw    DATABASE     _   CREATE DATABASE hw WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE hw;
                postgres    false            �            1259    16409    films    TABLE     x   CREATE TABLE public.films (
    uuid uuid NOT NULL,
    name character varying NOT NULL,
    length integer NOT NULL
);
    DROP TABLE public.films;
       public         heap    postgres    false            �            1259    16417    sessions    TABLE     �   CREATE TABLE public.sessions (
    uuid uuid NOT NULL,
    uuid_films uuid NOT NULL,
    price integer NOT NULL,
    session_start timestamp(0) without time zone NOT NULL
);
    DROP TABLE public.sessions;
       public         heap    postgres    false            �          0    16409    films 
   TABLE DATA           3   COPY public.films (uuid, name, length) FROM stdin;
    public          postgres    false    201   �
       �          0    16417    sessions 
   TABLE DATA           J   COPY public.sessions (uuid, uuid_films, price, session_start) FROM stdin;
    public          postgres    false    202   �        (           2606    16416    films films_pk 
   CONSTRAINT     N   ALTER TABLE ONLY public.films
    ADD CONSTRAINT films_pk PRIMARY KEY (uuid);
 8   ALTER TABLE ONLY public.films DROP CONSTRAINT films_pk;
       public            postgres    false    201            *           2606    16421    sessions sessions_pk 
   CONSTRAINT     T   ALTER TABLE ONLY public.sessions
    ADD CONSTRAINT sessions_pk PRIMARY KEY (uuid);
 >   ALTER TABLE ONLY public.sessions DROP CONSTRAINT sessions_pk;
       public            postgres    false    202            +           2606    16422    sessions sessions_fk    FK CONSTRAINT     x   ALTER TABLE ONLY public.sessions
    ADD CONSTRAINT sessions_fk FOREIGN KEY (uuid_films) REFERENCES public.films(uuid);
 >   ALTER TABLE ONLY public.sessions DROP CONSTRAINT sessions_fk;
       public          postgres    false    2856    202    201           