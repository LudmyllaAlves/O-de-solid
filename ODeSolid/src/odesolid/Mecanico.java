/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odesolid;

/**
 *
 * @author tatia
 */
public  class Mecanico {
    
    
    private String carro;
    private String caminhao;
    private String motocotinha;
    private String veiculos;
    
    public void reparo(){
        
        
        if(veiculos == carro){
        reparoCarro(veiculos);
        }
        else if(veiculos == caminhao){
        reparoCaminhao(veiculos);
        }
        else if( veiculos == motocotinha){
            reparoMotocotinha(veiculos);
        }
    
    }

    public void reparoCarro(String carro) {
        System.out.println("Reparando carro...");
    }
    public void reparoCaminhao(String caminhao) {
        System.out.println("Reparando caminhao...");
    }
    public void reparoMotocotinha(String motocotinha) {
        System.out.println("Reparando motocotinha...");
    }
    
    public void reparo2(){
    System.out.println("Ferramentas necessarrias:");
    }
    
}
