package cmt.software.cine.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "films")
public class Film implements Serializable {
    /**
    * Definición de los atributos de la clase, acompañado de la notación correspondiente
    * de Spring Boot para hacer referencia a la base de datos.
    * Every databases has its specific generation strategy, if you are building an application which will run across databases. AUTO is recommended.
    * */
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "length_min")
    private Integer lengthMin;
    @Column(name = "description")
    private String description;

    /**
     * Definición de los constructores del objeto
     * La documentación oficial recomienda dejar un constructor vacio ademas del
     * que tiene todos los atributos necesarios para operar.
     * */
    public Film() {
    }

    public Film(Long id, String name, Integer lengthMin, String description) {
        this.id = id;
        this.name = name;
        this.lengthMin = lengthMin;
        this.description = description;
    }

    /**
     * Definición de los getters y setters necesarios para acceder a cada atributo
     * Ademas hay que hacer Override de equals, hashCode y toString por si es necesario
     * comparar los objetos dentro de una colección.
     * */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(Integer lengthMin) {
        this.lengthMin = lengthMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        if (getId() == null) {
            return -1;
        }
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass().equals(obj.getClass())) {
            Film other = (Film) obj;
            if (this.getId() == null || other.getId() == null) {
                return false;
            }
            if (this.getId().equals(other.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Film [ name = " + getName() + ", address = " + getDescription() + " ]";
    }
}
