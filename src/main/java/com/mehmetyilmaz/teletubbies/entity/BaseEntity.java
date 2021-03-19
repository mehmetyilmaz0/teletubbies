package com.mehmetyilmaz.teletubbies.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "updated_by", length = 100)
    private String updatedBy;

    @Column(name = "status")
    private Boolean status;

}



/*
    specialComment
    @Data               : bulundugu classdaki degiskenlerin get/set metodlarini olusturuyor. class isminin ustunde kullanilir ve class daki tum degiskenlerin get/set metodlarina sahip olmasini saglar
                        alternatif  : her bir degiskenin ustunde @Getter ve @Setter anotationlar'i da kullanilabilir

    @MappedSuperclass   : diger class'larda extend edilebilir durumda olacak, ve BaseEntity class'inin diger class'lar icerisinde kullanilabilir duruma getirecek

    @Column             : ilgili degiskenin db de bir column oldugunu belirtmeye yarar.

    @Temporal           : ilgili column'un tutacagi veri tipinin formatini belirler.
*/