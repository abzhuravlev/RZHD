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
@Table(name = "натурный_список_вагонов")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class ListOfVagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "jsonb")
    @Column(name = "Порядковый_номер",columnDefinition = "jsonb")
    private Integer number;
    @Type(type = "jsonb")
    @Column(name = "Номер_вагона",columnDefinition = "jsonb")
    private Integer numberOfVagon;
    @Type(type = "jsonb")
    @Column(name = "Номенклатура_вагона",columnDefinition = "jsonb")
    private Integer nomenсlatureOfVagon;
    @Type(type = "jsonb")
    @Column(name = "Вес_груза",columnDefinition = "jsonb")
    private Double weightOfCargo;
    @Type(type = "jsonb")
    @Column(name = "Вес_вагона",columnDefinition = "jsonb")
    private Double weightOfVagon;
}
