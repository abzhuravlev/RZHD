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
@Table(name = "справочник_номенклатур_грузов")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class FaqNomenclatureCargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "jsonb")
    @Column(name = "Код_груза",columnDefinition = "jsonb")
    private String codeOfCargo;
    @Type(type = "jsonb")
    @Column(name = "Наименование_груза",columnDefinition = "jsonb")
    private String nameOfCargo;
}
