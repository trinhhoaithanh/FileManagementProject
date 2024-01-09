package filemanagement.filemanagement.controller;

import filemanagement.filemanagement.domain.Group;
import filemanagement.filemanagement.service.group.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/groups")
    public String createGroupForm(Model model){
        model.addAttribute("group", new Group());
        return "group";
    }

    @PostMapping("/groups/new")
    public String createGroup(@ModelAttribute("group") Group group) {
        groupService.createAGroup(group.getGroupName());
        return "redirect:/groups";
    }
}
