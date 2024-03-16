package ORIGEN;

import java.io.Serializable;
import java.util.ArrayList;

public class Licantropo implements Personaje, Serializable {

    private int rabia;
    private String nombre;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;
    private ArrayList<Arma> armasActivas;
    private Armadura armaduraActiva;
    private ArrayList<Esbirro> esbirros;
    private int oro;
    private int salud;
    private int poder;
    private ArrayList<Debilidad> debilidades;
    private ArrayList<Fortaleza> fortalezas;
    private String habilidad;
    private int atqHab;
    private int defHab;
    private int costeHabilidad;


    public int getRabia() {
        return rabia;
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }
    public void addArmas(Arma a) {
        this.armas.add(a);
    }
    @Override
    public ArrayList<Arma> getArmas() {
        return this.armas;
    }

    @Override
    public void setArmadura(ArrayList<Armadura> armaduras) {
        this.armaduras = armaduras;
    }
    public void addArmaduras(Armadura a) {
        this.armaduras.add(a);
    }
    @Override
    public ArrayList<Armadura> getArmadura() {
        return this.armaduras;
    }

    @Override
    public void setArmasActivas(ArrayList<Arma> armasActivas) {
        this.armasActivas = armasActivas;
    }
    public void addArmasActivas(Arma a) {
        this.armasActivas.add(a);
    }
    @Override
    public ArrayList<Arma> getArmasActivas() {
        return this.armasActivas;
    }

    @Override
    public void setArmaduraActiva(Armadura armaduraActiva) {
        this.armaduraActiva = armaduraActiva;
    }

    @Override
    public Armadura getArmaduraActiva() {
        return this.armaduraActiva;
    }

    @Override
    public void setEsbirros(ArrayList<Esbirro> esbirros) {
        this.esbirros = esbirros;
    }

    public void addEsbirro(Esbirro e){
        this.esbirros.add(e);
    }

    @Override
    public ArrayList<Esbirro> getEsbirros() {
        return this.esbirros;
    }

    @Override
    public void setOro(int oro) {
        this.oro = oro;
    }

    @Override
    public int getOro() {
        return this.oro;
    }

    @Override
    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public int getSalud() {
        return this.salud;
    }

    @Override
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public int getPoder(){
        return this.poder;
    }
    @Override
    public void setDebilidades(ArrayList<Debilidad> Debilidad) {
        this.debilidades = Debilidad;
    }
    public void addDebilidades(Debilidad d){
        this.debilidades.add(d);
    }
    @Override
    public ArrayList<Debilidad> getDebilidades() {
        return this.debilidades;
    }

    @Override
    public void setFortalezas(ArrayList<Fortaleza> fortalezas) {
        this.fortalezas = fortalezas;
    }
    public void addFortalezas(Fortaleza f){
        this.fortalezas.add(f);
    }

    @Override
    public ArrayList<Fortaleza> getFortalezas() {
        return this.fortalezas;
    }

    @Override
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public String getHabilidad(){
        return this.habilidad;
    }

    @Override
    public void setAtqHab(int ataque) {
        this.atqHab = ataque;
    }
    public int getAtqHab(){
        return this.atqHab;
    }

    @Override
    public void setDefHab(int defensa) {
        this.defHab = defensa;
    }
    public int getDefHab(){
        return  this.defHab;
    }

    @Override
    public void usarHabilidad() {
        System.out.println(" se uso el talento: "+  getHabilidad()+ ".");
    }

    public int getCosteHabilidad(){
        return costeHabilidad;
    }

    public void setCosteHabilidad(int coste){
        this.costeHabilidad = coste;
    }

    @Override
    public void ganarRonda() {

    }

    @Override
    public void perderRonda() {

    }

    @Override
    public int calcularAtaque() {
        return 0;
    }

    @Override
    public int calcularDefensa() {
        return 0;
    }

    @Override
    public int saludEsbirros() {
        return 0;
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public Esbirro crearEsbirros() {
        return null;
    }
}
