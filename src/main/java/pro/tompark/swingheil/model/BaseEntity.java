package pro.tompark.swingheil.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * Created by TomPark on 2018. 5. 11.
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_dt", updatable = false)
    private Date createdDt;

    @Column(name = "updated_dt")
    private Date updatedDt;

    @PrePersist
    protected void preInsert() {
        Date now = new Date();
        createdDt = now;
        updatedDt = now;
    }

    @PreUpdate
    protected void preUpdate() {
        updatedDt = new Date();
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
}
