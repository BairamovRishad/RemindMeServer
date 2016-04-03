package com.bairamov.remindme.server.service;

import com.bairamov.remindme.server.dal.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();

    Remind getByID(long id);

    Remind save(Remind remind);

    void remove(long id);

}