package com.animalerie;

public class Chien extends Animal{
    @Override
    public void Action() {
        System.out.println("Wouf Wouf");
    }

    //    private String race;
//    private int age;
//    private String couleur;
//    private String nom;
//    private boolean lof;
//
//    public void cri(){
//        System.out.println("il aboie !!!");
//    }
//
//    public Chien(String race,int age, String couleur, String nom, boolean lof){
//        this.nom = nom;
//        this.race = race;
//        this.age = age;
//        this.couleur = couleur;
//        this.lof = lof;
//    }
//
//    public String attaque(boolean reussi){
//        return (reussi) ? ("il a mordu la jambe") : ("il a grogné");
//    }
//
//
//    @Override
//    public String toString() {
//        return "Chien{" +
//                "race='" + race + '\'' +
//                ", age=" + age +
//                ", couleur='" + couleur + '\'' +
//                ", nom='" + nom + '\'' +
//                ", lof=" + lof +
//                '}';
//    }
//
//    public String getRace() {
//        return race;
//    }
//
//    public void setRace(String race) {
//        this.race = race;
//    }
//
//    public int getAge(int i) {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getCouleur() {
//        return couleur;
//    }
//
//    public void setCouleur(String couleur) {
//        this.couleur = couleur;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public boolean isLof(Boolean lof) {
//        return lof;
//    }
//
//    public void setLof(boolean lof) {
//        this.lof = lof;
//    }
}
