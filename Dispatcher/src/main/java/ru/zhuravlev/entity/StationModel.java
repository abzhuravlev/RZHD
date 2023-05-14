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
@Table(name = "станционная_модель")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class StationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "jsonb")
    @Column(name = "Номер_станции",columnDefinition = "jsonb")
    private String station;
    @Type(type = "jsonb")
    @Column(name = "Номер_пути",columnDefinition = "jsonb")
    private Integer railway;
}
