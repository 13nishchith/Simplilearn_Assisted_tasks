import { Component } from '@angular/core';
// import { listenerCount } from 'process';

@Component({
  selector: 'app-root',
  template: `<product-list></product-list>`,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'my-app1';
}
