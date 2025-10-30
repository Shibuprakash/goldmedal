package com.codecademy.goldmedal.repositories;

import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.GoldMedal;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal,Long>
{
    public List<GoldMedal> getByCountryOrderByYearAsc(String countryName);
    public List<GoldMedal> getByCountryOrderByYearDesc(String countryName);
    public List<GoldMedal> getByCountryOrderBySeasonDesc(String countryName);
    public List<GoldMedal> getByCountryOrderBySeasonAsc(String countryName);
    public List<GoldMedal> getByCountryOrderByCityDesc(String countryName);
    public List<GoldMedal> getByCountryOrderByCityAsc(String countryName);
    public List<GoldMedal> getByCountryOrderByNameDesc(String countryName);
    public List<GoldMedal> getByCountryOrderByNameAsc(String countryName);
    public List<GoldMedal> getByCountryOrderByEventDesc(String countryName);
    public List<GoldMedal> getByCountryOrderByEventAsc(String countryName);



}
