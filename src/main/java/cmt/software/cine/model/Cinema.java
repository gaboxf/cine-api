package cmt.software.cine.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cinemas")
public class Cinema implements Serializable {
    /**
    * Definición de los atributos de la clase, acompañado de la notación correspondiente
    * de Spring Boot para hacer referencia a la base de datos.
    * Every databases has its specific generation strategy, if you are building an application which will run across databases. AUTO is recommended.
    * */
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_id")
    private Long id;

    @Column(name = "cinema_name")
    private String name;

    @Column(name = "cinema_manager")
    private String manager;

    @Column(name = "cinema_address")
    private String address;

    @Column(name = "cinema_phone")
    private String phone;

    @Column(name = "cinema_seat_capacity")
    private Integer seatCapacity;

    @Column(name = "cinema_other_details")
    private String otherDetails;

    /**
     * Definición de los constructores del objeto
     * La documentación oficial recomienda dejar un constructor vacio ademas del
     * que tiene todos los atributos necesarios para operar.
     * */
    public Cinema() {
    }
    public Cinema(String name, String manager, String address, String phone, Integer seatCapacity, String otherDetails) {
        this.name = name;
        this.manager = manager;
        this.address = address;
        this.phone = phone;
        this.seatCapacity = seatCapacity;
        this.otherDetails = otherDetails;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(Integer seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
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
            Cinema other = (Cinema) obj;
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
        return "Cinema [ name = " + getName() + ", address = " + getAddress() + " ]";
    }
}
