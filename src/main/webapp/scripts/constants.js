'use strict';

/* Constants */

telewebApp.constant('USER_ROLES', {
        all: '*',
        admin: 'ROLE_ADMIN',
        user: 'ROLE_USER'
    });

// Define for each locale the associated flag
// It will be used by the library "http://www.famfamfam.com/lab/icons/flags/"
// to display the flag
telewebApp.constant('FLAGS', {
        da: 'dk',
        en: 'gb',
        es: 'es',
        fr: 'fr',
        kr: 'kr',
        de: 'de',
        pl: 'pl',
        ru: 'ru',
        tr: 'tr'
    });