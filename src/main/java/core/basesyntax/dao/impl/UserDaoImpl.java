package core.basesyntax.dao.impl;

import core.basesyntax.dao.UserDao;
import core.basesyntax.model.User;
import java.util.List;
import org.hibernate.SessionFactory;

public class UserDaoImpl extends AbstractDao<User> implements UserDao {
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User create(User entity) {
        return super.create(entity);
    }

    @Override
    public User get(Long id) {
        return super.get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return super.getAll("from User", User.class);
    }

    @Override
    public void remove(User entity) {
        super.remove(entity);
    }
}
