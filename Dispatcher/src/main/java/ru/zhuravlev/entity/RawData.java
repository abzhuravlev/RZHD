package ru.zhuravlev.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "паспорт_вагонов")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class RawData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "jsonb")
    @Column(name = "Номер_вагона",columnDefinition = "jsonb")
    private String numberOfVagon;
    @Type(type = "jsonb")
    @Column(name = "Вес_тары",columnDefinition = "jsonb")
    private Double weightOfTara;
    @Type(type = "jsonb")
    @Column(name = "Грузоподъемность",columnDefinition = "jsonb")
    private Integer totalWeightMax;

}
