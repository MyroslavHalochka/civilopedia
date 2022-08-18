package com.gamepedia.civilopedia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "capital")
public class Capital {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;

  @OneToMany(mappedBy = "capital", cascade = CascadeType.ALL)
  private List<CivilizationGlobal> civilizationGlobalList;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Capital() {
  }

  public Capital(String name) {
    this.name = name;
    civilizationGlobalList = new ArrayList<>();
  }

  public List<CivilizationGlobal> getCivilizationGlobalList() {
    return civilizationGlobalList;
  }

  public void setCivilizationGlobalList(
      List<CivilizationGlobal> civilizationGlobalList) {
    this.civilizationGlobalList = civilizationGlobalList;
  }

}
