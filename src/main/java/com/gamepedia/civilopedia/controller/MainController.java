package com.gamepedia.civilopedia.controller;

import com.gamepedia.civilopedia.model.Civilization;
import com.gamepedia.civilopedia.model.CivilizationGlobal;
import com.gamepedia.civilopedia.model.UniqueUnit;
import com.gamepedia.civilopedia.repository.CivilizationRepository;
import com.gamepedia.civilopedia.repository.CivilizationsRepository;
import com.gamepedia.civilopedia.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  private CivilizationRepository civilizationRepository;

  @Autowired
  private UnitRepository unitRepository;

  @Autowired
    private CivilizationsRepository civilizationsRepository;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("title", "Home");
    return "index";
  }

  @GetMapping("/civilizations")
  public String civilizations(Model model) {
    Iterable<CivilizationGlobal> civilizationGlobalList = civilizationsRepository.findAll();
    model.addAttribute("title", "Civilizations");
    model.addAttribute("civilization_global", civilizationGlobalList)
    return "civilizations";
  }

  @GetMapping("/civilization")
  public String civilization(Model model) {
    Iterable<Civilization> civilizationList = civilizationRepository.findAll();
    model.addAttribute("title", "Civilization");
    model.addAttribute("civilizations", civilizationList);
    return "civilization";
  }

  @GetMapping("/units")
  public String units(Model model) {
    Iterable<UniqueUnit> uniqueUnits = unitRepository.findAll();
    model.addAttribute("title", "Units");
    model.addAttribute("unique_unit", uniqueUnits);
    return "units";
  }

  @GetMapping("/technologies")
  public String technologies(Model model) {
    model.addAttribute("title", "Technologies");
    return "technologies";
  }

  @GetMapping("/resources")
  public String resources(Model model) {
    model.addAttribute("title", "Resources");
    return "resources";
  }

  @GetMapping("/fag")
  public String fag(Model model) {
    model.addAttribute("title", "FAQ");
    return "fag";
  }

  @GetMapping("/feedback")
  public String feedback(Model model) {
    model.addAttribute("title", "Feedback");
    return "feedback";
  }

  @GetMapping("/about")
  public String about(Model model) {
    model.addAttribute("title", "About");
    return "about";
  }

}
