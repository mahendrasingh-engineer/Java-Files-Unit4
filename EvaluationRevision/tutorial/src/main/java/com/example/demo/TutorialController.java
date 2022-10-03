package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tutorial;
import com.example.demo.repo.TutorialRepository;

@RestController
public class TutorialController {
	@Autowired
	TutorialRepository ttt;
	@PostMapping(value="/api/tutorials")
	public String tutorialFun(@RequestParam("Id") int i,@RequestParam("description") String desc,@RequestParam("title") String title){
		ttt.save(new Tutorial(i,title,desc));
		return "success";
	}
	@GetMapping(value="/api/tutorials")
	public List<Tutorial> tutorialFun2(){
		return ttt.findAll();
	}
	
	@GetMapping(value="/api/tutorials/:id")
	public Tutorial tutorialFun3(@RequestParam("id") int i){
		return ttt.findById(i).get();
	}
	
//	@PutMapping(value="/api/tutorials/:id")
//	public String tutorialFun4(@RequestParam("Id") int i,@RequestParam("description") String desc,@RequestParam("title") String title){
//		return "I love you";
//	}
//	
//	@PostMapping(value="/no")
//	public String tutorialFun5(@RequestParam("ii") int i){
//		return "I love you";
//	}
//	
//	@PostMapping(value="/not")
//	public String tutorialFun6(@RequestParam("tt") int i){
//		return "I love you";
//	}
//	
//	@PostMapping(value="/no")
//	public String tutorialFun7(@RequestParam("ii") int i){
//		return "I love you";
//	}
//	
//	@PostMapping(value="/not")
//	public String tutorialFun8(@RequestParam("tt") int i){
//		return "I love you";
//	}
}
