//package com.epam.esm.controller;
//
//import com.epam.esm.entity.Tag;
//import com.epam.esm.service.TagService;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/tags")
//public class TagController {
//
//    private final TagService tagService;
//    private final Tag tag;
//
//    public TagController(TagService tagService, Tag tag) {
//        this.tagService = tagService;
//        this.tag = tag;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Tag> findAll() {
//        return tagService.getAll();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Tag findById(@PathVariable int id) {
//        return tagService.findById(id);
//    }
//
//    @RequestMapping(value = "/save/{id}/{name}", method = RequestMethod.GET)
//    public List<Tag> saveTag(@PathVariable int id, @PathVariable String name) {
//        tag.setId(id);
//        tag.setName(name);
//        tagService.save(tag);
//        return tagService.getAll();
//    }
//
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public List<Tag> deleteTag(@PathVariable int id) {
//        Tag tag = tagService.findById(id);
//        tagService.delete(tag);
//        return tagService.getAll();
//    }

//}
