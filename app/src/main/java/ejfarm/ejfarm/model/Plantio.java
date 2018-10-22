package ejfarm.ejfarm.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable
public class Plantio {

    @DatabaseField(generatedId = true)
    private Integer id;

    @DatabaseField
    private Integer quantidadeSementes;

    @DatabaseField
    private Date dataPlantio;

    public Plantio() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidadeSementes() {
        return quantidadeSementes;
    }

    public void setQuantidadeSementes(Integer quantidadeSementes) {
        this.quantidadeSementes = quantidadeSementes;
    }

    public Date getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(Date dataPlantio) {
        this.dataPlantio = dataPlantio;
    }
}
