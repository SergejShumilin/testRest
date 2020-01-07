package com.epam.esm.dao.impl;

import com.epam.esm.dao.Dao;
import com.epam.esm.dao.connection.DBWorker;
import com.epam.esm.dao.mapper.TagMapper;
import com.epam.esm.entity.Tag;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TagDaoImpl implements Dao<Tag> {
    JdbcTemplate jdbcTemplate = DBWorker.getJdbcTemplate();

    @Override
    public void save(Tag tag) {
        jdbcTemplate.update("insert into tag values(?, ?)", tag.getId(), tag.getName());
    }

    @Override
    public void delete(Tag tag) {
        jdbcTemplate.update("DELETE FROM tag WHERE id = ?", tag.getId());
    }

    @Override
    public List<Tag> getAll() {
        JdbcTemplate jdbcTemplate = DBWorker.getJdbcTemplate();
        return jdbcTemplate.query("select * from tag", new TagMapper());
    }

    public Tag findById(int id){
        return jdbcTemplate.queryForObject("select * from tag where id = ?", new Object[]{id}, new TagMapper());
    }
}
