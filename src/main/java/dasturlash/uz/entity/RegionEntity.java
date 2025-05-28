package dasturlash.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "region")
public class RegionEntity {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;
@Column(unique = true)
private Integer orderNumber ;
@Column
private String nameUz;
@Column
private String nameRu;
@Column
private String nameEn;
@Column
private Integer regionKey;

}
