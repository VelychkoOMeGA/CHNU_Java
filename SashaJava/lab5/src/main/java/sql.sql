CREATE TABLE shape_schema.shape
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    type varchar(100) NOT NULL,
    CONSTRAINT PK_SHAPE PRIMARY KEY (id)
);
CREATE TABLE shape_schema.rectangle
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_shape BIGINT,
    width INT NOT NULL,
    length INT NOT NULL,
    CONSTRAINT PK_RECTANGLE PRIMARY KEY (id),
    FOREIGN KEY (id_shape) REFERENCES shape(id) ON UPDATE CASCADE ON DELETE SET NULL
);
CREATE TABLE shape_schema.circle
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_shape BIGINT,
    radius INT NOT NULL,
    CONSTRAINT PK_CIRCLE PRIMARY KEY (id),
    FOREIGN KEY (id_shape) REFERENCES shape(id) ON UPDATE CASCADE ON DELETE SET NULL
);