create schema "proyecto_base" authorization public_user;
create schema "keycloak_admin" authorization public_user;

-- base de datos de prueba

create sequence proyecto_base.rol_id_seq
  increment 1
  start 1
  minvalue 0
  maxvalue 9223372036854775807
  cache 1;

alter sequence proyecto_base.rol_id_seq
  owner to public_user;

create table proyecto_base.entidad_rol
  (
      id  bigint  not null    default nextval('proyecto_base.rol_id_seq')
          constraint rol_pk primary key,
      descripcion varchar(100) null
  );


create sequence proyecto_base.menu_id_seq
  increment 1
  start 1
  minvalue 0
  maxvalue 9223372036854775807
  cache 1;

alter sequence proyecto_base.menu_id_seq
  owner to public_user;

create table proyecto_base.entidad_menu
(
    id  bigint  not null    default nextval('proyecto_base.menu_id_seq')
        constraint menu_pk primary key,
    rol_id  bigint  not null
        constraint menu_rol_id_fk
        references proyecto_base.entidad_rol
        on update cascade on delete restrict,
    descripcion varchar(100) null,
    json_menu JSON
);