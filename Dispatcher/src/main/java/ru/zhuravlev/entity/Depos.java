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
@Table(name = "предприятие")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Depos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(type = "jsonb")
    @Column(name = "список_вагонов", columnDefinition = "jsonb")
    private Integer listTrains;
    @Type(type = "jsonb")
    @Column(name = "номер_пути", columnDefinition = "jsonb")
    private Integer railway;
}
