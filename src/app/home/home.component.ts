import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  ImgUrl='https://pixabay.com/photos/iron-man-avengers-marvel-super-hero-4241268https://cdn.pixabay.com/photo/2019/05/31/02/08/iron-man-4241268_960_720.jpg/'


  constructor() { }

  ngOnInit(): void {
  }

}
