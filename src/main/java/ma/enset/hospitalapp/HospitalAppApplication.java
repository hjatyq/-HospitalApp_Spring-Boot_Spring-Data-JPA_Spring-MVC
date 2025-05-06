package ma.enset.hospitalapp;

import ma.enset.hospitalapp.entities.Patient;
import ma.enset.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }



    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            Patient p1 =Patient.builder()
                    .nom("HAJAR")
                    .prenom("ATYQ")
                    .dateNaissance(new Date())
                    .malade(true)
                    .build();
            patientRepository.save(p1);

            Patient p2 =Patient.builder()
                    .nom("Imane")
                    .prenom("ATYQ")
                    .dateNaissance(new Date())
                    .malade(false)
                    .build();
            patientRepository.save(p2);

            Patient p3 =Patient.builder()
                    .nom("Hanane")
                    .prenom("ATYQ")
                    .dateNaissance(new Date())
                    .malade(true)
                    .build();
            patientRepository.save(p3);

            List<Patient> patients = patientRepository.findAll();

            patients.forEach(p->{
                System.out.println(p.toString());
            });

        };
    }
}
