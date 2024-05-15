package Sam.Cinema.Sphere.service;


import Sam.Cinema.Sphere.model.Session;
import Sam.Cinema.Sphere.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepo sessionRepo;
    @Override
    public Session saveSession(Session session) {
        return sessionRepo.save(session);
    }

    @Override
    public List<Session> getAllSes() {
        return sessionRepo.findAll();
    }

    @Override
    public List<Session> getAllSesByDate(Date date) {
        return sessionRepo.findAllByDate(date);
    }

    @Override
    public Session getSessionById(Long id) {
        return sessionRepo.findById(id).orElseThrow(() -> new RuntimeException("Film not found"));
    }

    @Override
    public void deleteSes(Long id) {

        sessionRepo.deleteById(id);
    }
}
