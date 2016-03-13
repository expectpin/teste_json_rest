(function () {
	
	function config ($routeProvider) {
		$routeProvider.when('/',{
			templateUrl: 'resources/templates/menu.html',
		});
		
		$routeProvider.when('/logradouros',{
			templateUrl: 'resources/templates/logradouros.html',
			controller: 'LogradouroController'
		});
		
		$routeProvider.otherwise({redirect: '/'});
	};
	
	angular
	  .module('LogradouroApp', ['ngRoute','ngResource','ui.bootstrap'])
	  .config(config);
  
})();