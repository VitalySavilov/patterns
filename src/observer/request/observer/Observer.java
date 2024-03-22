package observer.request.observer;

import observer.request.subject.Subject;

public interface Observer {
    void update(Subject subject);
}
