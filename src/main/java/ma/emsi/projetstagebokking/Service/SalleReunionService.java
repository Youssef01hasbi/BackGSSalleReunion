package ma.emsi.projetstagebokking.Service;

import ma.emsi.projetstagebokking.entites.SalleReunion;
import ma.emsi.projetstagebokking.repositories.SalleReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleReunionService {
    private final SalleReunionRepository salleReunionRepository;

    @Autowired
    public SalleReunionService(SalleReunionRepository salleReunionRepository) {
        this.salleReunionRepository = salleReunionRepository;
    }

    public SalleReunion addSalleReunion(SalleReunion salleReunion){
        return salleReunionRepository.save(salleReunion);
    }

    public List<SalleReunion> findAllSalleReunion(){
        return salleReunionRepository.findAll();
    }

    public SalleReunion updateSalleReunion(SalleReunion salleReunion){
        return salleReunionRepository.save(salleReunion);
    }

    public SalleReunion findSalleReunionById(Long id){
        return salleReunionRepository.findSalleReunionById(id);
    }

    public void deleteById(Long id){
        salleReunionRepository.deleteById(id);
    }


}
