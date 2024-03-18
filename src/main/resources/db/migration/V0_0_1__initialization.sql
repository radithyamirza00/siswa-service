
create table public.siswa
(
    id bigserial not null constraint siswa_pkey primary key,
    nama                varchar(255),
    umur                BIGINT,
    kelas                varchar(255),
    created_at                  timestamp,
    updated_at                  timestamp
);
