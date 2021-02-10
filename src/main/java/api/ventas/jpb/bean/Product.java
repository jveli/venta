package api.ventas.jpb.bean;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nameproduct")
    private String nameproduct;

    @Column(name = "typeproduct")
    private String typeproduct;

    @Column(name = "status")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public String getTypeproduct() {
        return typeproduct;
    }

    public void setTypeproduct(String typeproduct) {
        this.typeproduct = typeproduct;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
