package com.isac.notificacao.controller;


import com.isac.notificacao.business.EmailService;
import com.isac.notificacao.business.dtos.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO dto){
      emailService.enviaEmail(dto);
      return ResponseEntity.ok().build();
    }
}
