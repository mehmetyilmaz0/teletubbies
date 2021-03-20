package com.mehmetyilmaz.teletubbies.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "issueStatus")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assigee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;



}



/*
    specialComment

    @Entity             : bir entity oldugunu belirtiyor.
    @Table              : bir tablo oldugunu ve ismi gibi parametrelerle db de bir tabloya karsilik gelecegini gosterir
    @Id                 : o column un bir unique alan oldugunu belirtir.
    @GeneratedValue     : id nin nasil generate olacagini belirtilir.
    @Enumerated         : enum dan alinan verinin index i mi yoksa degeri mi db ye yazilacak belirlenir
    @Data               : get/set metodlari olusturur
    @NoArgsConstructor  : bos constructor olusturur
    @AllArgsConstructor : tum column lari iceren constructor olusturur
    @ToString           : tum column lari iceren to string metodu olusturur
    @EqualsAndHashCode  :
    @JoinColumn         :
    @ManyToOne          : birden fazla "mevcut class" (Issue), bir tane "hedef class" a (User) bagli olabilir. (bircok issue bir user a baglanabilir.)
                            optional = true         : bir issue olusturulurken "assignee" degerini vermesem de olur anlamina geliyor.
                            fetch = FetchType.LAZY  : issue tablosuna select atilirken, User tablosundaki join yapilip getirilsin mi?
                                LAZY    : ihtiyac halinde ben get metoduyla isterim.
                                EAGER   : her zaman getir.
*/