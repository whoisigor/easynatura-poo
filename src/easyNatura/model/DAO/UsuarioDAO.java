/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyNatura.model.DAO;

import easyNatura.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class UsuarioDAO {
    
    public void inserir(Usuario usuario){
          
        if(usuario.getId() == 0){
            usuario.setId(proximoId());
            Banco.usuario.add(usuario);
        }   
    }
    
    public boolean atualizar(Usuario usuario){ //vai sobrescrever o usuario antigo e retornar true
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    public ArrayList<Usuario> retornaTodos(){
        return Banco.usuario;
    }
    
    public boolean deletar(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    public Usuario selectPorLoginESenha(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(loginESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }
    
    private boolean loginESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getLogin().equals(usuarioAPesquisar.getLogin()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }
    
    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Usuario usuario : Banco.usuario) {           
           int id = usuario.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
        }
        
        return maiorId + 1;
    }
}
