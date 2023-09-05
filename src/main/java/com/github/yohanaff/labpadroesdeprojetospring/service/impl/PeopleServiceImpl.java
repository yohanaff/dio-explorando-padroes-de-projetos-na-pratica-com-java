package com.github.yohanaff.labpadroesdeprojetospring.service.impl;

import com.github.yohanaff.labpadroesdeprojetospring.client.SwapiClient;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import com.github.yohanaff.labpadroesdeprojetospring.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private SwapiClient swapiClient;

    @Override
    public PeopleDTO getPerson(int id) {
        return swapiClient.getPerson(id);
    }
}