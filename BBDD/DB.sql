
CREATE TABLE accidentes (
    idaccidente  NUMBER NOT NULL,
    fecha        VARCHAR2(10) NOT NULL,
    hora         VARCHAR2(10) NOT NULL,
    suceso       VARCHAR2(500) NOT NULL,
    lugar        VARCHAR2(100) NOT NULL,
    rut_id		 NUMBER NOT NULL,
    dias_perdidos NUMBER NOT NULL,
    num_trab     NUMBER NOT NULL 
);
ALTER TABLE accidentes ADD CONSTRAINT accidentes_pk PRIMARY KEY ( idaccidente );

CREATE SEQUENCE idacci
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_ACCI
BEFORE INSERT ON accidentes
FOR EACH ROW
BEGIN
SELECT idacci.NEXTVAL INTO :NEW.idaccidente FROM DUAL;
END;

CREATE TABLE asesorias (
    idasesoria        NUMBER NOT NULL,
    detalle           VARCHAR2(500),
    gestion           VARCHAR2(500) NOT NULL,
    propuestas        VARCHAR2(500),
    fecha             VARCHAR2(10),
    especial          VARCHAR2(5),
    visitas_idvisita  NUMBER NOT NULL
);
ALTER TABLE asesorias ADD CONSTRAINT asesorias_pk PRIMARY KEY ( idasesoria );

CREATE SEQUENCE idase
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_ASESO
BEFORE INSERT ON asesorias
FOR EACH ROW
BEGIN
SELECT idase.NEXTVAL INTO :NEW.idasesoria FROM DUAL;
END;


CREATE TABLE capacitaciones (
    idcapacitacion    NUMBER NOT NULL,
    fecha             VARCHAR2(10) NOT NULL,
    hora              VARCHAR2(10) NOT NULL,
    numasistentes     NUMBER,
    visitas_idvisita  NUMBER NOT NULL
);
ALTER TABLE capacitaciones ADD CONSTRAINT capacitaciones_pk PRIMARY KEY ( idcapacitacion );

CREATE SEQUENCE idcapa
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_CAPA
BEFORE INSERT ON capacitaciones
FOR EACH ROW
BEGIN
SELECT idcapa.NEXTVAL INTO :NEW.idcapacitacion FROM DUAL;
END;

CREATE TABLE chequeo (
    idchequeo         NUMBER NOT NULL,
    detalle           VARCHAR2(10) NOT NULL,
    estado            VARCHAR2(5) NOT NULL,
    visitas_idvisita  NUMBER NOT NULL
);
ALTER TABLE chequeo ADD CONSTRAINT chequeo_pk PRIMARY KEY ( idchequeo );

CREATE SEQUENCE idcheq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_CHECK
BEFORE INSERT ON chequeo
FOR EACH ROW
BEGIN
SELECT idcheq.NEXTVAL INTO :NEW.idchequeo FROM DUAL;
END;

CREATE TABLE cliente (
    rut                NUMBER NOT NULL,
    nombre             VARCHAR2(50) NOT NULL,
    telefono           NUMBER,
    correoelectronico  VARCHAR2(50),
    rubro              VARCHAR2(30),
    direccion          VARCHAR2(100) NOT NULL
);
ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rut );

CREATE TABLE empleado (
    rut_empleado  NUMBER NOT NULL,
    nombre        VARCHAR2(100) NOT NULL,
    especialidad  VARCHAR2(50)
);
ALTER TABLE empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( rut_empleado);

CREATE TABLE mejoras (
    idmejora     NUMBER NOT NULL,
    fecha        VARCHAR2(10),
    motivo       VARCHAR2(500),
    actividades  VARCHAR2(500),
    estado       VARCHAR2(5),
    rut_id   NUMBER NOT NULL
);
ALTER TABLE mejoras ADD CONSTRAINT mejoras_pk PRIMARY KEY ( idmejora );

CREATE SEQUENCE idmej
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_MEJORA
BEFORE INSERT ON mejoras
FOR EACH ROW
BEGIN
SELECT idmej.NEXTVAL INTO :NEW.idmejora FROM DUAL;
END;

CREATE TABLE pagos (
    idpago            NUMBER NOT NULL,
    mesanio           VARCHAR2 (11) NOT NULL,
    montoregular      NUMBER,
    montoadicionales  NUMBER,
    rut_id            NUMBER NOT NULL
);
ALTER TABLE pagos ADD CONSTRAINT pagos_pk PRIMARY KEY ( idpago );

CREATE SEQUENCE idpag
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_PAGOS
BEFORE INSERT ON pagos
FOR EACH ROW
BEGIN
SELECT idpag.NEXTVAL INTO :NEW.idpago FROM DUAL;
END;

CREATE TABLE visitas (
    idvisita             NUMBER NOT NULL,
    direccion            VARCHAR2(100),
    ciudad               VARCHAR2(50),
    fecha                VARCHAR2(10),
    resumen              VARCHAR2(500),
    observaciones        VARCHAR2(500),
    rut_id           	 NUMBER NOT NULL,
    empleado_rut_empleado NUMBER NOT NULL
);
ALTER TABLE visitas ADD CONSTRAINT visitas_pk PRIMARY KEY ( idvisita );

CREATE SEQUENCE idvis
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_PAGOS
BEFORE INSERT ON visitas
FOR EACH ROW
BEGIN
SELECT idvis.NEXTVAL INTO :NEW.idvisita FROM DUAL;
END;

ALTER TABLE accidentes
    ADD CONSTRAINT accidentes_cliente_fk FOREIGN KEY ( rut_id )
        REFERENCES cliente ( rut )
        ON DELETE CASCADE ;

ALTER TABLE asesorias
    ADD CONSTRAINT asesorias_visitas_fk FOREIGN KEY ( visitas_idvisita )
        REFERENCES visitas ( idvisita )
	ON DELETE CASCADE ;        

ALTER TABLE capacitaciones
    ADD CONSTRAINT capacitaciones_visitas_fk FOREIGN KEY ( visitas_idvisita )
        REFERENCES visitas ( idvisita )
	ON DELETE CASCADE ;
    
ALTER TABLE chequeo
    ADD CONSTRAINT chequeo_visitas_fk FOREIGN KEY ( visitas_idvisita )
        REFERENCES visitas ( idvisita )
	ON DELETE CASCADE ;
    
ALTER TABLE mejoras
    ADD CONSTRAINT mejoras_cliente_fk FOREIGN KEY ( rut_id )
        REFERENCES cliente ( rut )
  	ON DELETE CASCADE ;
    
ALTER TABLE pagos
    ADD CONSTRAINT pagos_cliente_fk FOREIGN KEY ( rut_id )
        REFERENCES cliente ( rut )
        ON DELETE CASCADE ;
        
ALTER TABLE visitas
    ADD CONSTRAINT visitas_cliente_fk FOREIGN KEY ( rut_id )
        REFERENCES cliente ( rut )
	ON DELETE CASCADE ;
    
ALTER TABLE visitas
    ADD CONSTRAINT visitas_empleado_fk FOREIGN KEY ( empleado_rut_empleado )
        REFERENCES empleado ( rut_empleado )
	ON DELETE CASCADE ;
    



