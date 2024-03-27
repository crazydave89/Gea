var menuLegowiska = document.querySelector('.menu-legowiska');
var menuStolPaszowyIpoidla = document.querySelector('.menuStolPaszowyIpoidla');
var content = document.querySelector('.content');

var materaceForm = document.getElementById('materaceForm');
var wygrodzenia2DoptimaForm = document.getElementById('wygrodzenia2DoptimaForm');

var stolPaszowyRuraKarkowaForm = document.getElementById('stolPaszowyRuraKarkowaForm');
var stolPaszowySwistLockForm = document.getElementById('stolPaszowySwistLockForm');
var stolPaszowyDrabinaDiagonalnaForm = document.getElementById('stolPaszowyDrabinaDiagonalnaForm');
var poidlaForm = document.getElementById('poidlaForm');

function addHiddenClassToAllMenu() {
            var elements = document.querySelectorAll('div.menumenu');
                elements.forEach(function(element) {
                element.classList.add('hidden');
                element.style.height = '0';
            });
        }
function addHiddenClassToAllForms() {
            var elements = document.querySelectorAll('form.myform');
                elements.forEach(function(element) {
                element.classList.add('hidden');
            });
        }

document.getElementById('option1').addEventListener('click', function() {
    addHiddenClassToAllMenu();
    menuLegowiska.classList.remove('hidden');

  if (menuLegowiska.clientHeight === 0) {
    menuLegowiska.style.height = '50px'; // Rozciągnięcie diva do 50px
    content.style.height = 'calc(100% - 100px)';
  } else {
    menuLegowiska.style.height = '0'; // Zmniejszenie wysokości diva do 0
    content.style.height = 'calc(100% - 50px)';
  }
});

document.getElementById('option2').addEventListener('click', function() {
    addHiddenClassToAllMenu();
    menuStolPaszowyIpoidla.classList.remove('hidden');

  if (menuStolPaszowyIpoidla.clientHeight === 0) {
    menuStolPaszowyIpoidla.style.height = '50px'; // Rozciągnięcie diva do 50px
    content.style.height = 'calc(100% - 100px)';
  } else {
    menuStolPaszowyIpoidla.style.height = '0'; // Zmniejszenie wysokości diva do 0
    content.style.height = 'calc(100% - 50px)';
  }
});

document.getElementById('materaceLegowiskowe').addEventListener('click', function() {
  addHiddenClassToAllForms();
  materaceForm.classList.remove('hidden');
});
document.getElementById('wygrodzenia2Doptima').addEventListener('click', function() {
  addHiddenClassToAllForms();
  wygrodzenia2DoptimaForm.classList.remove('hidden');
});

document.getElementById('stolPaszowyRuraKarkowa').addEventListener('click', function() {
  addHiddenClassToAllForms();
  stolPaszowyRuraKarkowaForm.classList.remove('hidden');
});
document.getElementById('stolPaszowySwistLock').addEventListener('click', function() {
  addHiddenClassToAllForms();
  stolPaszowySwistLockForm.classList.remove('hidden');
});
document.getElementById('stolPaszowyDrabinaDiagonalna').addEventListener('click', function() {
  addHiddenClassToAllForms();
  stolPaszowyDrabinaDiagonalnaForm.classList.remove('hidden');
});
document.getElementById('poidla').addEventListener('click', function() {
  addHiddenClassToAllForms();
  poidlaForm.classList.remove('hidden');
});