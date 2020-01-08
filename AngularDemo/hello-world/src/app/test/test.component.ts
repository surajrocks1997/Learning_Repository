import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  {{"Hello " + name}}
  <h2>{{name}}</h2>
  <h2>{{name | uppercase}}</h2>
  <h2>{{name | lowercase}}</h2>
  <h2>{{message | titlecase}}</h2>
  <h2>{{name | slice:3:5}}</h2>
  <h2>{{person | json}}</h2>

  <h2>{{5.678 | number:'1.2-3'}}</h2>
  <h2>{{5.678 | number:'3.4-5'}}</h2>
  <h2>{{5.678 | number:'3.1-2'}}</h2>

  <h2>{{0.25 | percent}}</h2>
  <h2>{{0.25 | currency}}</h2>
  <h2>{{0.25 | currency: 'EUR':'code'}}</h2>
  <h2>{{date}}</h2>
  <h2>{{date | date:'short'}}</h2>
  <h2>{{date | date:'shortDate'}}</h2>
  <h2>{{date | date:'shortTime'}}</h2>

  `,
  styles: []
})
export class TestComponent implements OnInit {

  
  public name = "theElite";
  public message = "welcome to the world";
  public person = {
    "firstName" : "john",
    "lastName" : "doe",
  }
  public date = new Date();
  constructor() { }

  ngOnInit() {
  }
}
