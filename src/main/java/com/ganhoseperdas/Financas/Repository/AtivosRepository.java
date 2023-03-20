package com.ganhoseperdas.Financas.Repository;

import com.ganhoseperdas.Financas.Model.AcressimoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface  AtivosRepository extends JpaRepository<AcressimoModel,Integer> {
}
