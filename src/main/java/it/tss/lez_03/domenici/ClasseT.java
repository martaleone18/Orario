/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.lez_03.domenici;

import java.security.InvalidParameterException;
import javax.xml.validation.Validator;

/**
 *
 * @author tss
 */
public class ClasseT {

    private int h, m, s;

    public ClasseT(int h, int m, int s) {
       valida(h, m, s);
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
    public void valido(int h, int m, int s) {
        if(!valida(h, m, s)) {
            throw new InvalidParameterException("Orario non valido");
        }
    }
    

    public boolean valida(int h, int m, int s) {
        return true;
    }
    
    public void aggiungi (int h, int m, int s){
        
    }
    
    public void sottrai (int h, int m, int s){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.h;
        hash = 53 * hash + this.m;
        hash = 53 * hash + this.s;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClasseT other = (ClasseT) obj;
        if (this.h != other.h) {
            return false;
        }
        if (this.m != other.m) {
            return false;
        }
        if (this.s != other.s) {
            return false;
        }
        return true;
    }

@Override
    public String toString() {
        return "ora: " + h + "minuti: " + m + "secondi: " + s;
    }
}
