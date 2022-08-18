package com.gamepedia.civilopedia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.mapping.Set;

@Entity
public class CivilizationGlobal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "capital_id")
  private Capital capital;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "civilization_id")
  private Civilization civilization;

  @Column(name = "preferences")
  private Set preferences;

  @Column(name = "initial_achievements")
  private Set initialAchievements;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ruler_id")
  private Ruler ruler;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "unique_unit_id")
  private UniqueUnit uniqueUnit;

  public CivilizationGlobal() {
  }

  public CivilizationGlobal(Set preferences, Set initialAchievements) {
    this.preferences = preferences;
    this.initialAchievements = initialAchievements;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Capital getCapital() {
    return capital;
  }

  public void setCapital(Capital capital) {
    this.capital = capital;
  }

  public Civilization getCivilization() {
    return civilization;
  }

  public void setCivilization(Civilization civilization) {
    this.civilization = civilization;
  }

  public Set getPreferences() {
    return preferences;
  }

  public void setPreferences(Set preferences) {
    this.preferences = preferences;
  }

  public Set getInitialAchievements() {
    return initialAchievements;
  }

  public void setInitialAchievements(Set initialAchievements) {
    this.initialAchievements = initialAchievements;
  }

  public Ruler getRuler() {
    return ruler;
  }

  public void setRuler(Ruler ruler) {
    this.ruler = ruler;
  }

  public UniqueUnit getUniqueUnit() {
    return uniqueUnit;
  }

  public void setUniqueUnit(UniqueUnit uniqueUnit) {
    this.uniqueUnit = uniqueUnit;
  }
}
