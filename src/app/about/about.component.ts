import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  ImgUrl='https://pixabay.com/photos/iron-man-avengers-marvel-super-hero-4241268https://cdn.pixabay.com/photo/2019/05/31/02/08/iron-man-4241268_960_720.jpg/'


  constructor() { }

  ngOnInit(): void {
  }

  
}
