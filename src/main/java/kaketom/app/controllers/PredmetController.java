package kaketom.app.controllers;

import kaketom.app.repositories.PredmetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredmetController {

    private final PredmetRepository predmetRepository;

    @Autowired
    public PredmetController(PredmetRepository predmetRepository) {
        this.predmetRepository = predmetRepository;
    }
}
