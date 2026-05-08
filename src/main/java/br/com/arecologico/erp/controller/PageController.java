package br.com.arecologico.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * PageController - Controla o mapeamento de todas as páginas HTML
 * Mapeia as rotas para os templates Thymeleaf
 */
@Controller
public class PageController {

    // ============ DASHBOARD ============
    @GetMapping("/")
    public String dashboard() {
        return "index";
    }

    // ============ LOGIN ============
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // ============ CLIENTES ============
    @GetMapping("/clientes/cadastro")
    public String clientesCadastro() {
        return "clientes/cadastro";
    }

    @GetMapping("/clientes/lista")
    public String clientesLista() {
        return "clientes/lista";
    }

    // ============ ORDEM DE SERVIÇO ============
    @GetMapping("/os/nova")
    public String osNova() {
        return "os/nova";
    }

    @GetMapping("/os/lista")
    public String osLista() {
        return "os/lista";
    }

    @GetMapping("/os/detalhe")
    public String osDetalhe() {
        return "os/detalhe";
    }

    // ============ CONTRATOS ============
    @GetMapping("/contratos/lista")
    public String contratosLista() {
        return "contratos/lista";
    }

    // ============ RH / FUNCIONÁRIOS ============
    @GetMapping("/rh/cadastro")
    public String rhCadastro() {
        return "rh/cadastro";
    }

    @GetMapping("/rh/ponto")
    public String rhPonto() {
        return "rh/ponto";
    }

    @GetMapping("/rh/desempenho")
    public String rhDesempenho() {
        return "rh/desempenho";
    }

    // ============ FINANCEIRO ============
    @GetMapping("/financeiro/receber")
    public String financeiroReceber() {
        return "financeiro/receber";
    }

    // ============ SERVIÇOS ============
    @GetMapping("/servicos/lista")
    public String servicosLista() {
        return "servicos/lista";
    }

    // ============ RELATÓRIOS ============
    @GetMapping("/relatorios")
    public String relatorios() {
        return "relatorios/index";
    }

    // ============ FISCAL ============
    @GetMapping("/fiscal")
    public String fiscal() {
        return "fiscal/index";
    }

    // ============ ESTOQUE ============
    @GetMapping("/estoque")
    public String estoque() {
        return "estoque/index";
    }

    // ============ CONFIGURAÇÕES ============
    @GetMapping("/configuracoes")
    public String configuracoes() {
        return "configuracoes/index";
    }
}

