import { Component, OnInit, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-home-page-main-animation',
  templateUrl: './home-page-main-animation.component.html',
  styleUrls: ['./home-page-main-animation.component.css']
})
export class HomePageMainAnimationComponent implements OnInit, AfterViewInit {

  isLoad: boolean = false;
  isNotLoad: boolean = true;
  constructor() { }

  ngOnInit(): void {
    
  }
  ngAfterViewInit(): void{
    setTimeout(()=>{this.isLoad = true; this.isNotLoad = false;}, 500);
  }

}
