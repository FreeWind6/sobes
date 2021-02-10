CREATE TABLE public.films
(
    uuid   uuid    NOT NULL,
    name   varchar NOT NULL,
    length int4    NOT NULL,
    CONSTRAINT films_pk PRIMARY KEY (uuid)
);

CREATE TABLE public.sessions
(
    uuid          uuid         NOT NULL,
    uuid_films    uuid         NOT NULL,
    price         int4         NOT NULL,
    session_start timestamp(0) NOT NULL,
    CONSTRAINT sessions_pk PRIMARY KEY (uuid),
    CONSTRAINT sessions_fk FOREIGN KEY (uuid_films) REFERENCES public.films (uuid)
);