/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.compras02.controller;

import br.edu.compras02.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonat
 */
public class ClienteController {
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void editarCliente(int index, Cliente cliente) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.set(index, cliente);
        }
    }

    public void excluirCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.remove(index);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Cliente selecionado para exclusão", "Erro ao excluir Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public Cliente getCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            return listaDeClientes.get(index);
        }
        return null;
    }
}